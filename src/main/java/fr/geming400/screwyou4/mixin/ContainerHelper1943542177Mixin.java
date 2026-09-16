package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ContainerHelper.class)
public class ContainerHelper1943542177Mixin {
        @Inject(at = @At("HEAD"), method = "removeItem(Ljava/util/List;II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void removeItem__653977981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653977981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearOrCountMatchingItems(Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Predicate;IZ)I", cancellable = true)
    private static void clearOrCountMatchingItems__911987840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-911987840L))
            info.setReturnValue(1364242918);
    }

    @Inject(at = @At("HEAD"), method = "clearOrCountMatchingItems(Lnet/minecraft/world/Container;Ljava/util/function/Predicate;IZ)I", cancellable = true)
    private static void clearOrCountMatchingItems_2123299850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2123299850L))
            info.setReturnValue(-2056447783);
    }

    @Inject(at = @At("HEAD"), method = "loadAllItems(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private static void loadAllItems_591964070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591964070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAllItems(Lnet/minecraft/world/level/storage/ValueOutput;Lnet/minecraft/core/NonNullList;Z)V", cancellable = true)
    private static void saveAllItems_118827308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(118827308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAllItems(Lnet/minecraft/world/level/storage/ValueOutput;Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private static void saveAllItems_774911670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(774911670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeItem(Ljava/util/List;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void takeItem__174942501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-174942501L))
            info.setReturnValue(null);
    }


}
