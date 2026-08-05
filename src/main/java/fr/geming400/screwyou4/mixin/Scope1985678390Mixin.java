package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Scope.class)
public class Scope1985678390Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void get__2126062138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126062138L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/util/parsing/packrat/Atom;Ljava/lang/Object;)V", cancellable = true)
    private void put__1339102416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1339102416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_850217919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850217919L))
            info.setReturnValue("))#\u9F67\u0CEF>1\u2CB5UU6[ga4p<o2_nXhlXfogg7\u236DsD");
    }

    @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/util/parsing/packrat/Atom;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getOrDefault__264179606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264179606L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "pushFrame()V", cancellable = true)
    private void pushFrame_2023953129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023953129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void getOrThrow__2126062138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126062138L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "popFrame()V", cancellable = true)
    private void popFrame_2023953129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023953129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lastFrame()Ljava/util/Map;", cancellable = true)
    private void lastFrame__18945250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18945250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitFrame()V", cancellable = true)
    private void splitFrame_2023953129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023953129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mergeFrame()V", cancellable = true)
    private void mergeFrame_2023953129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023953129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAny([Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void getAny__972627199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972627199L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "hasOnlySingleFrame()Z", cancellable = true)
    private void hasOnlySingleFrame_2023956973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023956973L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearFrameValues()V", cancellable = true)
    private void clearFrameValues_2023953129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2023953129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "valueIndexForAny([Lnet/minecraft/util/parsing/packrat/Atom;)I", cancellable = true)
    private void valueIndexForAny_564771292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564771292L))
            info.setReturnValue(-645612810);
    }

    @Inject(at = @At("HEAD"), method = "getAnyOrThrow([Lnet/minecraft/util/parsing/packrat/Atom;)Ljava/lang/Object;", cancellable = true)
    private void getAnyOrThrow__972627199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972627199L))
            info.setReturnValue(new java.lang.Object());
    }


}
