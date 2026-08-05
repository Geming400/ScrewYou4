package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SortedArraySet.class)
public class SortedArraySet1298784556Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1750413445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750413445L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1742516145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742516145L))
            info.setReturnValue(942875075);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void get_787951105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787951105L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_390157792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390157792L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_512956850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(512956850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;)Z", cancellable = true)
    private void add_1725005502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725005502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toArray()[Ljava/lang/Object;", cancellable = true)
    private void toArray_960457826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960457826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toArray([Ljava/lang/Object;)[Ljava/lang/Object;", cancellable = true)
    private void toArray_2125037189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125037189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1362103942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362103942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains_1530737536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530737536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "last()Ljava/lang/Object;", cancellable = true)
    private void last_1835255005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835255005L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "first()Ljava/lang/Object;", cancellable = true)
    private void first_89757047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89757047L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Comparator;)Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create__1109982778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109982778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create_754758206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754758206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Comparator;I)Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create_1802358309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802358309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/util/SortedArraySet;", cancellable = true)
    private static void create_1765717645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765717645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOrGet(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void addOrGet_1205723389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205723389L))
            info.setReturnValue(new java.lang.Object());
    }


}
