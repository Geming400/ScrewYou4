package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.RandomSupport.Seed128bit.class)
public class Seed128bit1766521885Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1142933152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1142933152L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_631061910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631061910L))
            info.setReturnValue("6X,i8ib'r>#>xDci@lG\uA5603DW\u7CB38;\u31D8bT,2Ncwb@I(.srX\u84D8r2&v&\u28EBl>Z7C(:\u5E0De_@'=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1804784627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804784627L))
            info.setReturnValue(651281176);
    }

    @Inject(at = @At("HEAD"), method = "xor(JJ)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private void xor__1723388037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723388037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xor(Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private void xor__1824000532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824000532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seedHi()J", cancellable = true)
    private void seedHi_1804785092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804785092L))
            info.setReturnValue(-1806270069351985955L);
    }

    @Inject(at = @At("HEAD"), method = "seedLo()J", cancellable = true)
    private void seedLo_1804785092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804785092L))
            info.setReturnValue(-1806270069351985955L);
    }

    @Inject(at = @At("HEAD"), method = "mixed()Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private void mixed_1038127163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038127163L))
            info.setReturnValue(null);
    }


}
