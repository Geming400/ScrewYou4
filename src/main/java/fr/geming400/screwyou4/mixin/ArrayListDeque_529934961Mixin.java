package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ArrayListDeque.class)
public class ArrayListDeque_529934961Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove_1963975598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963975598L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_973666549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973666549L))
            info.setReturnValue(-599111119);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get__1818771300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818771300L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "replaceAll(Ljava/util/function/UnaryOperator;)V", cancellable = true)
    private void replaceAll__1589440375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1589440375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(ILjava/lang/Object;)V", cancellable = true)
    private void add_1984450713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984450713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__1324264268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324264268L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_46424759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46424759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "capacity()I", cancellable = true)
    private void capacity__1252339748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252339748L))
            info.setReturnValue(793202852);
    }

    @Inject(at = @At("HEAD"), method = "removeIf(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void removeIf__1004775595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004775595L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFirst()Ljava/lang/Object;", cancellable = true)
    private void getFirst_1578717573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578717573L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getLast()Ljava/lang/Object;", cancellable = true)
    private void getLast__1631708649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631708649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFirst(Ljava/lang/Object;)V", cancellable = true)
    private void addFirst__2053259440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2053259440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLast(Ljava/lang/Object;)V", cancellable = true)
    private void addLast_843402760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(843402760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFirst()Ljava/lang/Object;", cancellable = true)
    private void removeFirst__1312449641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312449641L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "removeLast()Ljava/lang/Object;", cancellable = true)
    private void removeLast__1170782779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170782779L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "reversed()Lnet/minecraft/util/ListAndDeque;", cancellable = true)
    private void reversed_1947086610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947086610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reversed()Ljava/util/SequencedCollection;", cancellable = true)
    private void reversed__1910786671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910786671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reversed()Ljava/util/List;", cancellable = true)
    private void reversed__414210782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414210782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reversed()Ljava/util/Deque;", cancellable = true)
    private void reversed_953769490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953769490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pollFirst()Ljava/lang/Object;", cancellable = true)
    private void pollFirst_603803516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603803516L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "pollLast()Ljava/lang/Object;", cancellable = true)
    private void pollLast__589504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589504L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "offerLast(Ljava/lang/Object;)Z", cancellable = true)
    private void offerLast__334594447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334594447L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "peekFirst()Ljava/lang/Object;", cancellable = true)
    private void peekFirst_188634208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188634208L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "removeFirstOccurrence(Ljava/lang/Object;)Z", cancellable = true)
    private void removeFirstOccurrence_416261542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416261542L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "offerFirst(Ljava/lang/Object;)Z", cancellable = true)
    private void offerFirst_83417487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83417487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "peekLast()Ljava/lang/Object;", cancellable = true)
    private void peekLast__1815097380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815097380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeLastOccurrence(Ljava/lang/Object;)Z", cancellable = true)
    private void removeLastOccurrence_1769697976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769697976L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "descendingIterator()Ljava/util/Iterator;", cancellable = true)
    private void descendingIterator_205588950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205588950L))
            info.setReturnValue(null);
    }


}
