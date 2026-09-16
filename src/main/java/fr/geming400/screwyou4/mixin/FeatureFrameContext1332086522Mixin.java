package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureFrameContext.class)
public class FeatureFrameContext1332086522Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_423460254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423460254L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2102510047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2102510047L))
            info.setReturnValue("mcE\"LcgaJ{tw\uB4D1lh\u96CF\u53AF:P\u616BGVr+]hes?2a'`\"}STE\uD594rVe\u68D4?KVWW7[<\u3DD1kXxiyw{|J\u8E70L\uD6EEM-zk4jG4o5%CH2xhn:\u3B51CD_]&-w=Z]\u2F03oG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1889438613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889438613L))
            info.setReturnValue(1443285681);
    }

    @Inject(at = @At("HEAD"), method = "options()Lnet/minecraft/client/renderer/state/OptionsRenderState;", cancellable = true)
    private void options_1155108431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155108431L))
            info.setReturnValue(new net.minecraft.client.renderer.state.OptionsRenderState());
    }

    @Inject(at = @At("HEAD"), method = "blockColors()Lnet/minecraft/client/color/block/BlockColors;", cancellable = true)
    private void blockColors__417530810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417530810L))
            info.setReturnValue(new net.minecraft.client.color.block.BlockColors());
    }

    @Inject(at = @At("HEAD"), method = "textureManager()Lnet/minecraft/client/renderer/texture/TextureManager;", cancellable = true)
    private void textureManager_1865877112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865877112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlasManager()Lnet/minecraft/client/resources/model/sprite/AtlasManager;", cancellable = true)
    private void atlasManager_311589182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311589182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightmap()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void lightmap__40469842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40469842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stagedVertexBuffer()Lnet/minecraft/client/renderer/StagedVertexBuffer;", cancellable = true)
    private void stagedVertexBuffer__158886164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158886164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateModelSet()Lnet/minecraft/client/renderer/block/BlockStateModelSet;", cancellable = true)
    private void blockStateModelSet__1211226806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211226806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "font()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void font_47518876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47518876L))
            info.setReturnValue(null);
    }


}
