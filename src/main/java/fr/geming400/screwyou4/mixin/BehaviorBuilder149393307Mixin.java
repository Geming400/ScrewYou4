package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder.class)
public class BehaviorBuilder149393307Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_213370798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213370798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instance()Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder$Instance;", cancellable = true)
    private static void instance_2092195036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092195036L))
            info.setReturnValue(new net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder.Instance());
    }

    @Inject(at = @At("HEAD"), method = "sequence(Lnet/minecraft/world/entity/ai/behavior/declarative/Trigger;Lnet/minecraft/world/entity/ai/behavior/OneShot;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void sequence__1747386202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747386202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unbox(Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private static void unbox__63743535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63743535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerIf(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/behavior/OneShot;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerIf__1206248936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206248936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerIf(Ljava/util/function/Predicate;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerIf_549953400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549953400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerIf(Ljava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerIf_1066778609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1066778609L))
            info.setReturnValue(null);
    }


}
