package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamageSourcePredicate.class)
public class DamageSourcePredicate_1607986385Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1301468653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301468653L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_472526409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472526409L))
            info.setReturnValue("0\u4E4C\u064C#y5|\u3E75M[x\uB0D1Z\uBB98C7?bk#`q\u7A2F)ox`S_\u1D93%;g.vs.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1646249126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646249126L))
            info.setReturnValue(100787908);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void matches_161988112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161988112L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void matches_1077365989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077365989L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDirect()Ljava/util/Optional;", cancellable = true)
    private void isDirect_1853447806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853447806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/List;", cancellable = true)
    private void tags__1060644096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060644096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity()Ljava/util/Optional;", cancellable = true)
    private void sourceEntity_1853447806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853447806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directEntity()Ljava/util/Optional;", cancellable = true)
    private void directEntity_1853447806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853447806L))
            info.setReturnValue(null);
    }


}
