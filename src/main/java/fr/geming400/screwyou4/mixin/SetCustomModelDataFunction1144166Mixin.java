package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetCustomModelDataFunction.class)
public class SetCustomModelDataFunction1144166Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__160203642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160203642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1577774857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1577774857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1736997890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736997890L))
            info.setReturnValue(null);
    }


}
