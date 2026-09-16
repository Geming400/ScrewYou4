package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionMesh.SectionDraw.class)
public class SectionDraw_682401471Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__226224798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226224798L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1452824995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452824995L))
            info.setReturnValue("\uC1A6]q[Wze?4R1Kw-&x\u0C617tj;rK<,./\uFE16 \u997BH,\u0C37lP/,\uD19Fo4\u2B77jr1n3`?Q\u3595n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1239753561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239753561L))
            info.setReturnValue(-1166835787);
    }

    @Inject(at = @At("HEAD"), method = "indexType()Lcom/mojang/blaze3d/IndexType;", cancellable = true)
    private void indexType__609978921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609978921L))
            info.setReturnValue(com.mojang.blaze3d.IndexType.SHORT);
    }

    @Inject(at = @At("HEAD"), method = "indexCount()I", cancellable = true)
    private void indexCount_1181096807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181096807L))
            info.setReturnValue(1149716780);
    }

    @Inject(at = @At("HEAD"), method = "hasCustomIndexBuffer()Z", cancellable = true)
    private void hasCustomIndexBuffer_2016521422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016521422L))
            info.setReturnValue(false);
    }


}
