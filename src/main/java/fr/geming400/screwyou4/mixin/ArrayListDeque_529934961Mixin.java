package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ArrayListDeque.class)
public class ArrayListDeque_529934961Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove_2103718066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103718066L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_568197206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568197206L))
            info.setReturnValue(1926764549);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get_2103718066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103718066L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "replaceAll(Ljava/util/function/UnaryOperator;)V", cancellable = true)
    private void replaceAll_85770102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(85770102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(ILjava/lang/Object;)V", cancellable = true)
    private void add_1657694968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1657694968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set_1412512470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412512470L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1210951373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1210951373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "capacity()I", cancellable = true)
    private void capacity_568197206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568197206L))
            info.setReturnValue(1926764549);
    }

    @Inject(at = @At("HEAD"), method = "removeIf(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void removeIf_600295350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600295350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFirst()Ljava/lang/Object;", cancellable = true)
    private void getFirst__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getLast()Ljava/lang/Object;", cancellable = true)
    private void getLast__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "addFirst(Ljava/lang/Object;)V", cancellable = true)
    private void addFirst_1915442879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915442879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLast(Ljava/lang/Object;)V", cancellable = true)
    private void addLast_1915442879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915442879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFirst()Ljava/lang/Object;", cancellable = true)
    private void removeFirst__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "removeLast()Ljava/lang/Object;", cancellable = true)
    private void removeLast__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "reversed()Lnet/minecraft/util/ListAndDeque;", cancellable = true)
    private void reversed_112060308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112060308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reversed()Ljava/util/SequencedCollection;", cancellable = true)
    private void reversed__151804269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151804269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reversed()Ljava/util/List;", cancellable = true)
    private void reversed__2138566560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138566560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reversed()Ljava/util/Deque;", cancellable = true)
    private void reversed__961652076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961652076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pollFirst()Ljava/lang/Object;", cancellable = true)
    private void pollFirst__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "pollLast()Ljava/lang/Object;", cancellable = true)
    private void pollLast__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "offerLast(Ljava/lang/Object;)Z", cancellable = true)
    private void offerLast_1915446723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915446723L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "peekFirst()Ljava/lang/Object;", cancellable = true)
    private void peekFirst__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "removeFirstOccurrence(Ljava/lang/Object;)Z", cancellable = true)
    private void removeFirstOccurrence_1915446723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915446723L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "offerFirst(Ljava/lang/Object;)Z", cancellable = true)
    private void offerFirst_1915446723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915446723L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "peekLast()Ljava/lang/Object;", cancellable = true)
    private void peekLast__1905840117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905840117L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "removeLastOccurrence(Ljava/lang/Object;)Z", cancellable = true)
    private void removeLastOccurrence_1915446723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915446723L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "descendingIterator()Ljava/util/Iterator;", cancellable = true)
    private void descendingIterator__1621681072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621681072L))
            info.setReturnValue(null);
    }


}
