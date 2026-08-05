package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureFrameContext.class)
public class FeatureFrameContext1332086522Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1577368515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577368515L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_196626547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196626547L))
            info.setReturnValue("fa-)=@\"<f'GcM㸪#c\"త=Wdcvw'\".l쳜B3cy-@.HjX^>Gz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1370349264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370349264L))
            info.setReturnValue(-328697742);
    }

    @Inject(at = @At("HEAD"), method = "options()Lnet/minecraft/client/renderer/state/OptionsRenderState;", cancellable = true)
    private void options_1706490033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706490033L))
            info.setReturnValue(new net.minecraft.client.renderer.state.OptionsRenderState());
    }

    @Inject(at = @At("HEAD"), method = "lightmap()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void lightmap__1068528088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068528088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "font()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void font__1696711861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696711861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureManager()Lnet/minecraft/client/renderer/texture/TextureManager;", cancellable = true)
    private void textureManager__1789250842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789250842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockColors()Lnet/minecraft/client/color/block/BlockColors;", cancellable = true)
    private void blockColors_1246764329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246764329L))
            info.setReturnValue(new net.minecraft.client.color.block.BlockColors());
    }

    @Inject(at = @At("HEAD"), method = "atlasManager()Lnet/minecraft/client/resources/model/sprite/AtlasManager;", cancellable = true)
    private void atlasManager_636323868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636323868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stagedVertexBuffer()Lnet/minecraft/client/renderer/StagedVertexBuffer;", cancellable = true)
    private void stagedVertexBuffer_962159394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962159394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateModelSet()Lnet/minecraft/client/renderer/block/BlockStateModelSet;", cancellable = true)
    private void blockStateModelSet__1141331411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1141331411L))
            info.setReturnValue(null);
    }


}
