package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ModifyContainerContents.class)
public class ModifyContainerContents142603443Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run__18744365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18744365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1719234134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1719234134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1878457167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878457167L))
            info.setReturnValue(null);
    }


}
