package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityEffectsPredicate.class)
public class EntityEffectsPredicate1406016446Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1503438591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503438591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_270556471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270556471L))
            info.setReturnValue("형IO漫sĂM40猸⾹GK(R6kci=f<[eh\".4,(9,l_=i+1&(Qc옸n3%(cm붟0x}\"駧)'-AbQ;6/dHy$5ObU1Q||Z=Cf爬k5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1444279188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444279188L))
            info.setReturnValue(-453417052);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__548175465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548175465L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/advancements/predicates/MobEffectsPredicate;", cancellable = true)
    private void effects__448185384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448185384L))
            info.setReturnValue(null);
    }


}
