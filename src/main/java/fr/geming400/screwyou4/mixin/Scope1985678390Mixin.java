package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Scope.class)
public class Scope1985678390Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void get_719764400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719764400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/util/parsing/packrat/Atom;Ljava/lang/Object;)V", cancellable = true)
    private void put__1756322241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1756322241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1538865877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538865877L))
            info.setReturnValue("\u8DA2z]R,l\u46EE\u7EE12\u50FBq\u126A{2s*wZu$\u46CD'\u25A0tc\uD61A2TRD\"]wz\u3220ILr/1(H5hF66ll@EUUl=-eRQ9\uA1C9K \uFC24wz-/s]mM&\uA396=:y}kIrD");
    }

    @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/util/parsing/packrat/Atom;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getOrDefault__1188755134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188755134L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "pushFrame()V", cancellable = true)
    private void pushFrame__1635501994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635501994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void getOrThrow_1256236441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256236441L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getAny([Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void getAny__346137161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346137161L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "popFrame()V", cancellable = true)
    private void popFrame__1387535667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1387535667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mergeFrame()V", cancellable = true)
    private void mergeFrame_1172168692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1172168692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitFrame()V", cancellable = true)
    private void splitFrame_1195484246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1195484246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lastFrame()Ljava/util/Map;", cancellable = true)
    private void lastFrame__1267614393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267614393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAnyOrThrow([Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void getAnyOrThrow__1629032914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629032914L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "clearFrameValues()V", cancellable = true)
    private void clearFrameValues__1221008441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1221008441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasOnlySingleFrame()Z", cancellable = true)
    private void hasOnlySingleFrame__2048721778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048721778L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "valueIndexForAny([Lnet/minecraft/util/parsing/packrat/Atom;)I", cancellable = true)
    private void valueIndexForAny__116665416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116665416L))
            info.setReturnValue(614101187);
    }


}
