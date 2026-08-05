package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionMesh.SectionDraw.class)
public class SectionDraw_682401471Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2067913729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067913729L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__453058505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453058505L))
            info.setReturnValue("HFGBtq.G2Lzu Kr#}/V꠫< )8bd<d(K낁Q5 G<O瞡|xⲯ9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_720664212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720664212L))
            info.setReturnValue(-1569417703);
    }

    @Inject(at = @At("HEAD"), method = "hasCustomIndexBuffer()Z", cancellable = true)
    private void hasCustomIndexBuffer_720680053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720680053L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "indexType()Lcom/mojang/blaze3d/IndexType;", cancellable = true)
    private void indexType_2011286955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011286955L))
            info.setReturnValue(com.mojang.blaze3d.IndexType.SHORT);
    }

    @Inject(at = @At("HEAD"), method = "indexCount()I", cancellable = true)
    private void indexCount_720663716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720663716L))
            info.setReturnValue(-1390894213);
    }


}
