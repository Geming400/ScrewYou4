package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder.Instance.class)
public class Instance1437872808Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;)Ljava/lang/Object;", cancellable = true)
    private void get_2053165546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053165546L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void map__603782045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603782045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void map_2110184256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110184256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registered(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void registered__1782338475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782338475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "present(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void present__1782338475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782338475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Ljava/lang/Object;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void point_1124011772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124011772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Ljava/util/function/Supplier;Ljava/lang/Object;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void point__706563853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706563853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Ljava/lang/Object;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void point__951631353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951631353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryGet(Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;)Ljava/util/Optional;", cancellable = true)
    private void tryGet_296841277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296841277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absent(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void absent__1782338475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782338475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTriggered(Lnet/minecraft/world/entity/ai/behavior/declarative/Trigger;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ifTriggered__439738186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439738186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap3(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void ap3_1624546336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624546336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap3(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ap3__1673362845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673362845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap2(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ap2_1090730392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090730392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap2(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void ap2_67085579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67085579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lift1(Lcom/mojang/datafixers/kinds/App;)Ljava/util/function/Function;", cancellable = true)
    private void lift1_1519095016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519095016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap4(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void ap4__1739220053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739220053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap4(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ap4_1279049464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279049464L))
            info.setReturnValue(null);
    }


}
