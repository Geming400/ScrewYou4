package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityNbtPredicate.class)
public class EntityNbtPredicate_386854080Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__521772189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521772189L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1157277604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157277604L))
            info.setReturnValue("{)\u4349@k3ozfwEbgBA\u81E9\u030Crh=tC)J|WVL_`\u4746\u58F3\uCDDCU^c38\u9B5DE8q9gF'JT0*UBw\"dm\u1DA6\uA856<2\u2574\u2DD3\u79C04pr\u1010h\u7FF6!\uBF820\u6F27OBmI2D^%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_944206170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944206170L))
            info.setReturnValue(-346557802);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1737163013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737163013L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Lnet/minecraft/advancements/predicates/NbtPredicate;", cancellable = true)
    private void nbt_2122125515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122125515L))
            info.setReturnValue(null);
    }


}
