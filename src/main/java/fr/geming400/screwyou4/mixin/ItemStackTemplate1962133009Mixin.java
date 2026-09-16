package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemStackTemplate.class)
public class ItemStackTemplate1962133009Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__666127054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666127054L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1053506741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053506741L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1562410762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562410762L))
            info.setReturnValue("_C\u95ABz#w\"S \u17CB2\uD2E8a_X\u46CCF\uB2A3N)'vLBT.=`F)aJN4B\u9494BT2:O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1775482196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775482196L))
            info.setReturnValue(-2076795762);
    }

    @Inject(at = @At("HEAD"), method = "apply(ILnet/minecraft/core/component/DataComponentPatch;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void apply_1709766440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709766440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/core/component/DataComponentPatch;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void apply__1934765165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934765165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_873962568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873962568L))
            info.setReturnValue(-1942907824);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void create__1021937871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021937871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item_1429840026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429840026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void components_628355420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628355420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNonEmptyStack(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void fromNonEmptyStack__1795329172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795329172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder__1961617465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961617465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromStack(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void fromStack__749224948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749224948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCount(I)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void withCount_221527417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221527417L))
            info.setReturnValue(null);
    }


}
