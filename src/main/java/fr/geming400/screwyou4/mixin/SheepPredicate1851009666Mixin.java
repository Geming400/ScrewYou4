package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.SheepPredicate.class)
public class SheepPredicate1851009666Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_942383398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942383398L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1673534105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673534105L))
            info.setReturnValue("\uB2F4?\uAEA6Z6+P\uBC13v)BX(;|A\uA358R\u92B3Rl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1886605539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886605539L))
            info.setReturnValue(294469429);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1093648696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093648696L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasWool()Lnet/minecraft/advancements/predicates/entity/SheepPredicate;", cancellable = true)
    private static void hasWool_796590610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796590610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheared()Ljava/util/Optional;", cancellable = true)
    private void sheared__1759800976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759800976L))
            info.setReturnValue(null);
    }


}
