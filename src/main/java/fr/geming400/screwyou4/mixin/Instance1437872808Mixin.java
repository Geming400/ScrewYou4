package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder.Instance.class)
public class Instance1437872808Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;)Ljava/lang/Object;", cancellable = true)
    private void get__1429225644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429225644L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void map__1493933689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493933689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void map__711701604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711701604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registered(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void registered_1252513171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252513171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "present(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void present__763797446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763797446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Ljava/util/function/Supplier;Ljava/lang/Object;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void point_1079761251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079761251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Ljava/lang/Object;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void point_460997527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460997527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Ljava/lang/Object;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void point__1561086100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561086100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryGet(Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;)Ljava/util/Optional;", cancellable = true)
    private void tryGet__1944639550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944639550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absent(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void absent_390827516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390827516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap2(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void ap2_1645566958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645566958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap2(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ap2__923746347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923746347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap4(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void ap4__1145519280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145519280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap4(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ap4__1538290381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538290381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap3(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void ap3_1965871804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965871804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ap3(Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;Lcom/mojang/datafixers/kinds/App;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ap3__1789598137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789598137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lift1(Lcom/mojang/datafixers/kinds/App;)Ljava/util/function/Function;", cancellable = true)
    private void lift1__1654585874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654585874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTriggered(Lnet/minecraft/world/entity/ai/behavior/declarative/Trigger;)Lnet/minecraft/world/entity/ai/behavior/declarative/BehaviorBuilder;", cancellable = true)
    private void ifTriggered__1368036496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368036496L))
            info.setReturnValue(null);
    }


}
