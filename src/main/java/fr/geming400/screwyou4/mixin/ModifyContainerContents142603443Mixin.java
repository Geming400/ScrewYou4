package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ModifyContainerContents.class)
public class ModifyContainerContents142603443Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1374684766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374684766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__876115328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-876115328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1209048697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209048697L))
            info.setReturnValue(null);
    }


}
