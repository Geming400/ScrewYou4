package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetCustomModelDataFunction.class)
public class SetCustomModelDataFunction1144166Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1233225489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233225489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1017574605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1017574605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1067589420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067589420L))
            info.setReturnValue(null);
    }


}
