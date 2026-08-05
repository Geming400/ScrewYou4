package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemorySlot.class)
public class MemorySlot663932089Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1771842988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771842988L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__471528382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471528382L))
            info.setReturnValue("O]kSn࣠1竻]\"E?AP,mx");
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_702206828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702206828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;J)V", cancellable = true)
    private void set_693328202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(693328202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;)V", cancellable = true)
    private void set_2049440008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2049440008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/memory/MemorySlot;", cancellable = true)
    private static void create__1478951948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1478951948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/Brain$Visitor;)V", cancellable = true)
    private void visit__1555221599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1555221599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_702206828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702206828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasValue()Z", cancellable = true)
    private void hasValue_702210672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702210672L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canExpire()Z", cancellable = true)
    private void canExpire_702210672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702210672L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "timeToLive()J", cancellable = true)
    private void timeToLive_702195296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702195296L))
            info.setReturnValue(-8037709688899165582L);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired_702210672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702210672L))
            info.setReturnValue(false);
    }


}
