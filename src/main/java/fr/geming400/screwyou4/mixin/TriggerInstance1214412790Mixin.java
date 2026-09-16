package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnterBlockTrigger.TriggerInstance.class)
public class TriggerInstance1214412790Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_305786522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305786522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1984836315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984836315L))
            info.setReturnValue("=^Ecs]\uA20FbfKC,ZNbe{`\u8B27\u1D4FC(@e/_i{{4Q\u3A0BTb3\uABD1>TjiG>9pY\u3B4A9zRG[l)`Tu0Y{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1771764881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771764881L))
            info.setReturnValue(1669795375);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void matches__737713591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737713591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "state()Ljava/util/Optional;", cancellable = true)
    private void state__1176614091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176614091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block__1859512527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859512527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entersBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entersBlock__2018448169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018448169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__16240251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16240251L))
            info.setReturnValue(null);
    }


}
