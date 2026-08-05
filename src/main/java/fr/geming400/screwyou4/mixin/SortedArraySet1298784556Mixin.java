package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SortedArraySet.class)
public class SortedArraySet1298784556Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1610670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1337046802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337046802L))
            info.setReturnValue(-1892183849);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void get_1310862507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310862507L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1610670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1337059295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1337059295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)Z", cancellable = true)
    private void add__1610670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toArray()[Ljava/lang/Object;", cancellable = true)
    private void toArray_1348503232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348503232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toArray([Ljava/lang/Object;)[Ljava/lang/Object;", cancellable = true)
    private void toArray_656071527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656071527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__852831476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852831476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains__1610670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "last()Ljava/lang/Object;", cancellable = true)
    private void last__1136990521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136990521L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "first()Ljava/lang/Object;", cancellable = true)
    private void first__1136990521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136990521L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Comparator;)Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create_266518850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266518850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create__32719550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32719550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Comparator;I)Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create_1524235817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524235817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create_2017409801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017409801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOrGet(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void addOrGet_1310862507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310862507L))
            info.setReturnValue(new java.lang.Object());
    }


}
