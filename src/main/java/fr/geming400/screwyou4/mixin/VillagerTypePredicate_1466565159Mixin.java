package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.VillagerTypePredicate.class)
public class VillagerTypePredicate_1466565159Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_557938890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557938890L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2057978613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057978613L))
            info.setReturnValue("5Srh7J$+0yte_td,X{3<%L3x9_J7s&2}ZOV2v{9wkHQ!xjy1}sc#u\u1FDDE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2023917249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023917249L))
            info.setReturnValue(2093136457);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1111887604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111887604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1572186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572186L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches_1934386399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934386399L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypes(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/core/component/predicates/VillagerTypePredicate;", cancellable = true)
    private static void villagerTypes__171236270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171236270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "villagerTypes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void villagerTypes_604005837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604005837L))
            info.setReturnValue(null);
    }


}
