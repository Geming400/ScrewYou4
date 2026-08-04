package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ContainerHelper.class)
public class ContainerHelper1943542177Mixin {
        @Inject(at = @At("HEAD"), method = "removeItem(Ljava/util/List;II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void removeItem__132516980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132516980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearOrCountMatchingItems(Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Predicate;IZ)I", cancellable = true)
    private static void clearOrCountMatchingItems_210922788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210922788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearOrCountMatchingItems(Lnet/minecraft/world/Container;Ljava/util/function/Predicate;IZ)I", cancellable = true)
    private static void clearOrCountMatchingItems_1964983270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964983270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "takeItem(Ljava/util/List;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void takeItem_276816341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276816341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveAllItems(Lnet/minecraft/world/level/storage/ValueOutput;Lnet/minecraft/core/NonNullList;Z)V", cancellable = true)
    private static void saveAllItems__1063887128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1063887128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAllItems(Lnet/minecraft/world/level/storage/ValueOutput;Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private static void saveAllItems__787261062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-787261062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadAllItems(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private static void loadAllItems__445501077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445501077L))
            info.cancel();
    }


}
