package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.MovingBlockFeatureRenderer.Submit.class)
public class Submit_2134650996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__774804042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774804042L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_999191020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999191020L))
            info.setReturnValue("6ꇰlU覅DM?5⍾5(&맞\">Hn0aryP$hI#Bㅽ'JgO?evAO㟍d.f䫠K#SIFAy윗[]]4V&rma<Ya焲eꋊ[Y凘Sqga3硄|㏷(o% 䀵ทG?$[㒞Jm=`oXꮑx!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2122053559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122053559L))
            info.setReturnValue(-1308714115);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__417342063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417342063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outlineColor()I", cancellable = true)
    private void outlineColor__2122054055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122054055L))
            info.setReturnValue(1613469106);
    }

    @Inject(at = @At("HEAD"), method = "movingBlockRenderState()Lnet/minecraft/client/renderer/block/MovingBlockRenderState;", cancellable = true)
    private void movingBlockRenderState_649497127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649497127L))
            info.setReturnValue(new net.minecraft.client.renderer.block.MovingBlockRenderState());
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq__2122056938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122056938L))
            info.setReturnValue(6.832099E8F);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__1129232775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129232775L))
            info.setReturnValue(null);
    }


}
