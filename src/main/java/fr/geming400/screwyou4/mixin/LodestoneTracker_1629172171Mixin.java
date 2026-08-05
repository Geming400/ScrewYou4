package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.LodestoneTracker.class)
public class LodestoneTracker_1629172171Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1280282867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280282867L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Ljava/util/Optional;", cancellable = true)
    private void target_1874633592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874633592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_493712195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493712195L))
            info.setReturnValue("\u2056$IuAA]\u148F |_L/MiyPv{][+hEo}+b=}X\u2BD4p\u6CDB!q7\u9DE9Xk\u6182$SD\u2CB12;+Kg\uD439eAarL\u6539|_M'b5VC`\u8A24\uC9AAa]#\u9EE9\u7F095\u405Bqr{U6t\"&mi!;F\uAC19^C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1667434912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667434912L))
            info.setReturnValue(1918086515);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/item/component/LodestoneTracker;", cancellable = true)
    private void tick__2121509941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121509941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tracked()Z", cancellable = true)
    private void tracked_1667450753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667450753L))
            info.setReturnValue(true);
    }


}
