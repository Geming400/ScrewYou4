package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.CommandQueueEntry.class)
public class CommandQueueEntry225990766Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1611503025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611503025L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__909469209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909469209L))
            info.setReturnValue("P!@-6WNri謱溈m箤贵譈Y4?*uaVᴟZnx}I뀥@hvW*K두8pbWxF=R삩Ekm'WAAKjBHpssN1ybg, !m涋mT-V:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_264253508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264253508L))
            info.setReturnValue(1535082100);
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;)V", cancellable = true)
    private void execute__1603926217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1603926217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/commands/execution/EntryAction;", cancellable = true)
    private void action_1628858782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628858782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frame()Lnet/minecraft/commands/execution/Frame;", cancellable = true)
    private void frame_432583321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432583321L))
            info.setReturnValue(null);
    }


}
