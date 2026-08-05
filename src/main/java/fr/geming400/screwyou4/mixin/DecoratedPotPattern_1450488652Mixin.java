package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotPattern.class)
public class DecoratedPotPattern_1450488652Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1458966386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458966386L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_315028676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315028676L))
            info.setReturnValue("P/kb\uBD32?U6W[#3\u4384\u5F06+\u78D8_*;_=7.n}b/\uA475_)#\uA35FG\uB478M,w\u5ECF._7JPyP)&0osh4$x'.FCm|+a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1488751393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488751393L))
            info.setReturnValue(-1324178552);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__992577902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992577902L))
            info.setReturnValue(null);
    }


}
