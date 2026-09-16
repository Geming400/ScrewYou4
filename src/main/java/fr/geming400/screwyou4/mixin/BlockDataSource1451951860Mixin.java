package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.data.BlockDataSource.class)
public class BlockDataSource1451951860Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_543325592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543325592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2072591911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072591911L))
            info.setReturnValue("%\u66621C}tFy,VAdkwwH4jfNY)!EKlhK-YSU&g\u228B(Y*x[/-XG\u8ECE7ZM3M&}J=YP\uB47BOFpv`7$<[-3Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2009303951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009303951L))
            info.setReturnValue(1546997474);
    }

    @Inject(at = @At("HEAD"), method = "coordinates()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void coordinates_126507399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(126507399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/stream/Stream;", cancellable = true)
    private void getData_37888459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37888459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1776570182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776570182L))
            info.setReturnValue(null);
    }


}
