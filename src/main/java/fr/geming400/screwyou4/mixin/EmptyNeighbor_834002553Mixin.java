package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SideChainPartBlock.EmptyNeighbor.class)
public class EmptyNeighbor_834002553Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__74623716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74623716L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1604426077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604426077L))
            info.setReturnValue("c<\u59E1h\u062Bxc'0bmW2N@JA^x(w\uB999t{\uADA9g'{YqO\uB737,7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1391354643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391354643L))
            info.setReturnValue(58052162);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1446773723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446773723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnectable()Z", cancellable = true)
    private void isConnectable__680111435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680111435L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "connectsTowards(Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Z", cancellable = true)
    private void connectsTowards__1945395218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945395218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isUnconnectableOrChainEnd()Z", cancellable = true)
    private void isUnconnectableOrChainEnd__2144969039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144969039L))
            info.setReturnValue(true);
    }


}
