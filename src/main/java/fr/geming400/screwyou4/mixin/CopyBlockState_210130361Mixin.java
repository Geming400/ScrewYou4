package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyBlockState.class)
public class CopyBlockState_210130361Mixin {
        @Inject(at = @At("HEAD"), method = "copyState(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/storage/loot/functions/CopyBlockState$Builder;", cancellable = true)
    private static void copyState__987595203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987595203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1276575614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276575614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_989633588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989633588L))
            info.setReturnValue(null);
    }


}
