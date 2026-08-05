package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Aquifer.FluidStatus.class)
public class FluidStatus_310038511Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1695550769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695550769L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__825421465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825421465L))
            info.setReturnValue("䵩ewUwqJa`1l`fd4mv_G|?\":31Plr{\"z/_}Yt⯇#V羾&⭾PW훥'䌻먒⛊;v<,tF/ໃ>b}c'@T⓷3'鯕(K窗jtP鳇Fkv≶Is");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_348301252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348301252L))
            info.setReturnValue(906659835);
    }

    @Inject(at = @At("HEAD"), method = "at(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void at_1549595779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549595779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidLevel()I", cancellable = true)
    private void fluidLevel_348300756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348300756L))
            info.setReturnValue(1109807255);
    }

    @Inject(at = @At("HEAD"), method = "fluidType()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void fluidType__1985720356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985720356L))
            info.setReturnValue(null);
    }


}
