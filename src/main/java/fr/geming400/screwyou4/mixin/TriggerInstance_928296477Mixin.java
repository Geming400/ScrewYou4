package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChanneledLightningTrigger.TriggerInstance.class)
public class TriggerInstance_928296477Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_19670208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19670208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1698720001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698720001L))
            info.setReturnValue("K*M$w \u5163P\u2EE1\uC056nKIFl\uB98B&rGrif g\uC8AE>-rN\uBAA5oYgKjIU=a\u251ChMY>/t1%\u6AB1[4S/xyo?Z[W?1\uCBEAY q,(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1485648567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485648567L))
            info.setReturnValue(-179971813);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Collection;)Z", cancellable = true)
    private void matches__812748175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812748175L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1188469582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1188469582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channeledLightning([Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void channeledLightning__1857129285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857129285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "victims()Ljava/util/List;", cancellable = true)
    private void victims_1931905975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931905975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__302356565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302356565L))
            info.setReturnValue(null);
    }


}
