package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CrudeIncrementalIntIdentityHashBiMap.class)
public class CrudeIncrementalIntIdentityHashBiMap_1357573197Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1801304785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801304785L))
            info.setReturnValue(2024685829);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_571745490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(571745490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/CrudeIncrementalIntIdentityHashBiMap;", cancellable = true)
    private void copy__1776494795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776494795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)I", cancellable = true)
    private void add_1783777805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783777805L))
            info.setReturnValue(-1319275923);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1303315302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303315302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(I)Z", cancellable = true)
    private void contains__387709605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387709605L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains_1589526176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589526176L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId_493939101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493939101L))
            info.setReturnValue(1627215588);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/util/CrudeIncrementalIntIdentityHashBiMap;", cancellable = true)
    private static void create_1546851575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546851575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId__1579455876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579455876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMapping(Ljava/lang/Object;I)V", cancellable = true)
    private void addMapping_1303255881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303255881L))
            info.cancel();
    }


}
