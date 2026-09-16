package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PackSelectionConfig.class)
public class PackSelectionConfig_1289557609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_380931340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380931340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2059981133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059981133L))
            info.setReturnValue("(!WP5_1J_)moWt\uD191]Llb\uCA88th{3*z3b=( '+\u6694vd\u8FA1#`\uC8DCLT?_u&YasrmS\uAD76u]FJ'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1846909699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846909699L))
            info.setReturnValue(1268838123);
    }

    @Inject(at = @At("HEAD"), method = "defaultPosition()Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private void defaultPosition_1826645894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826645894L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.BOTTOM);
    }

    @Inject(at = @At("HEAD"), method = "fixedPosition()Z", cancellable = true)
    private void fixedPosition__1958745726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958745726L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required__1997968416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997968416L))
            info.setReturnValue(true);
    }


}
