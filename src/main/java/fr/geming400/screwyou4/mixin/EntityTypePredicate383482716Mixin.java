package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityTypePredicate.class)
public class EntityTypePredicate383482716Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__525143552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-525143552L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1153906241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153906241L))
            info.setReturnValue("%yGPb%[\uC2D45p8M\u294Cb`JSll\u1D9BQn_1Y\"\u9347c`w%j\u8FBF:B\uA361\u01C6/P*5\u488Eh#<S\uCDC3^-oL9$l5-\u5501NkQue6[rPD-&!()\u36AD>e7^M2_#WFY7RySevIk+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_940834807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940834807L))
            info.setReturnValue(-44082094);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/entity/EntityTypePredicate;", cancellable = true)
    private static void of__1108891404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108891404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/advancements/predicates/entity/EntityTypePredicate;", cancellable = true)
    private static void of_246864581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246864581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches_851303957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851303957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1733791650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733791650L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "types()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void types_899808041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899808041L))
            info.setReturnValue(null);
    }


}
