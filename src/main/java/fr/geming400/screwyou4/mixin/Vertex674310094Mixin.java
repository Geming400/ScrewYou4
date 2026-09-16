package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.Vertex.class)
public class Vertex674310094Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__234316174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234316174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1444733619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444733619L))
            info.setReturnValue("uyZ}K?L|\u6677=2{i>\u4F71U:#p\u5803EJ|\uA8E8B]Ks\u95C7\u477EQtr/zG%j\"D\u1B29VE=v%)]{&<1XN\u4C3B\uBA4C.'\uCD7C&GyGlN{oba{o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1231662185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231662185L))
            info.setReturnValue(-493820592);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x__146899719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146899719L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "v()F", cancellable = true)
    private void v__204158021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204158021L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z__89641417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89641417L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "u()F", cancellable = true)
    private void u__232787172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232787172L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y__118270568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118270568L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "worldX()F", cancellable = true)
    private void worldX_1714556715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714556715L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "worldZ()F", cancellable = true)
    private void worldZ_1771815017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771815017L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "worldY()F", cancellable = true)
    private void worldY_1743185866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743185866L))
            info.setReturnValue(5.85756E8F);
    }

    @Inject(at = @At("HEAD"), method = "remap(FF)Lnet/minecraft/client/model/geom/ModelPart$Vertex;", cancellable = true)
    private void remap__1294618372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294618372L))
            info.setReturnValue(null);
    }


}
