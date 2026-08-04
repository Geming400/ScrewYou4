package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyBlockState.class)
public class CopyBlockState_210130361Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1945984084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945984084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1618905126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618905126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyState(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/storage/loot/functions/CopyBlockState$Builder;", cancellable = true)
    private static void copyState__137925087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137925087L))
            info.setReturnValue(null);
    }


}
