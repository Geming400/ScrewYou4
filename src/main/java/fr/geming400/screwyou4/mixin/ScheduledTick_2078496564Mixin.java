package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.ScheduledTick.class)
public class ScheduledTick_2078496564Mixin {
        @Inject(at = @At("HEAD"), method = "priority()Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private void priority__531790086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531790086L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.EXTREMELY_LOW);
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/lang/Object;", cancellable = true)
    private void type__1035836280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035836280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1169870295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169870295L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1446047208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446047208L))
            info.setReturnValue(".9\u3795s\u00FB30[3Ew)XA`7B,4?SV\uB77E\u22CE%y\uB05AlT7\u06D77cMG1>arY_UN( \u2163Uhq ks ])5N\uA49DyIvC-b\u4F04=]aZI2>\u4B76^=r-_z\u31F7y&g*NgD]9g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1659118642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659118642L))
            info.setReturnValue(1284081121);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__202279712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202279712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "probe(Ljava/lang/Object;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private static void probe_295932055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295932055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSavedTick(J)Lnet/minecraft/world/ticks/SavedTick;", cancellable = true)
    private void toSavedTick_1002432992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002432992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerTick()J", cancellable = true)
    private void triggerTick_1602228869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602228869L))
            info.setReturnValue(-8504215236784739737L);
    }

    @Inject(at = @At("HEAD"), method = "subTickOrder()J", cancellable = true)
    private void subTickOrder__60345815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60345815L))
            info.setReturnValue(-515384056326854838L);
    }


}
