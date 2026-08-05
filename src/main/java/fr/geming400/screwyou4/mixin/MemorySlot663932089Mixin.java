package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemorySlot.class)
public class MemorySlot663932089Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__339588859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339588859L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1434355118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434355118L))
            info.setReturnValue("o\uB3BE'i\u6DAC5\uCE28\u6F44!gb\u9C56o\uFCB3h\u0CC2HG%SyG6{sOfht^@qsKFKTh\u59D38\u4ACADw<C/\u00B7 B0iaSK'\u3536Ycf&}{MoslZ1\"F\u89D8\u61C4e\uC194s$@\u2873lt\u15F4a");
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__121895617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-121895617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;J)V", cancellable = true)
    private void set__1990291540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1990291540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;)V", cancellable = true)
    private void set__1500811674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1500811674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/memory/MemorySlot;", cancellable = true)
    private static void create_801636472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801636472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/Brain$Visitor;)V", cancellable = true)
    private void visit_643493558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(643493558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_534248431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(534248431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasValue()Z", cancellable = true)
    private void hasValue__951253543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951253543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "timeToLive()J", cancellable = true)
    private void timeToLive__1859758164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859758164L))
            info.setReturnValue(-5833761386296141034L);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired__1091847643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091847643L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canExpire()Z", cancellable = true)
    private void canExpire__1999149375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999149375L))
            info.setReturnValue(true);
    }


}
