package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder.class)
public class BehaviorBuilder149393307Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_612692266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612692266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instance()Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder$Instance;", cancellable = true)
    private static void instance__1603425071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603425071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sequence(Lnet/minecraft/world/entity/ai/behavior/declarative/Trigger;Lnet/minecraft/world/entity/ai/behavior/OneShot;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void sequence__1298342683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298342683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unbox(Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private static void unbox_905984547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905984547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerIf(Ljava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerIf__637262980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637262980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerIf(Ljava/util/function/Predicate;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerIf_704604611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704604611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerIf(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/behavior/OneShot;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerIf_1210450531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210450531L))
            info.setReturnValue(null);
    }


}
