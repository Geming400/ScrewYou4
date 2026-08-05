package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.VillagerTypePredicate.class)
public class VillagerTypePredicate_1466565159Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1442889879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442889879L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_331105183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331105183L))
            info.setReturnValue("8{l6珓竺PxgE%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1504827900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504827900L))
            info.setReturnValue(-383836040);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1560083275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560083275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1442761415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442761415L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches__1281923156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281923156L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypes(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/core/component/predicates/VillagerTypePredicate;", cancellable = true)
    private static void villagerTypes_1143175365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143175365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void villagerTypes__1208449094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208449094L))
            info.setReturnValue(null);
    }


}
