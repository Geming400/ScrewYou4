package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.class)
public class EntityEquipmentPredicate1713113714Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_804487446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804487446L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1811430057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811430057L))
            info.setReturnValue("\u5D55\u15B08vkb\u837AK( \u98D0QT>5$\uAAEC{\u51DC\"i8)}]=\u1C0A^rU\u1D04AOWr.(N,F\uC1EFMY\u4EC7Irt.,o\uCC8E42c\uA4C0,7\u2A0Do=h-Hnzi|U=\u159Bnm6in\uCF88(o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2024501491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024501491L))
            info.setReturnValue(-1522547187);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches_1111060021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111060021L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1231544648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231544648L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "head()Ljava/util/Optional;", cancellable = true)
    private void head_1020963328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020963328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body()Ljava/util/Optional;", cancellable = true)
    private void body__1298042942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298042942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "captainPredicate(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate;", cancellable = true)
    private static void captainPredicate__903491570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903491570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chest()Ljava/util/Optional;", cancellable = true)
    private void chest__1693667295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1693667295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "legs()Ljava/util/Optional;", cancellable = true)
    private void legs__905233083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905233083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offhand()Ljava/util/Optional;", cancellable = true)
    private void offhand_992993406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992993406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainhand()Ljava/util/Optional;", cancellable = true)
    private void mainhand_1602569672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602569672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "feet()Ljava/util/Optional;", cancellable = true)
    private void feet__1516062770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516062770L))
            info.setReturnValue(null);
    }


}
