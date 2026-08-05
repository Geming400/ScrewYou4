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
            info.setReturnValue("P!@-6WNri\u8B31\u6E88m\u7BA4\u8D35\u8B48Y4?*uaV\u1D1FZnx}I\uB025@hvW*K\uB4508pbWxF=R\uC0A9Ekm'WAAKjBHpssN1ybg, !m\u6D8BmT-V:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_264253508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264253508L))
            info.setReturnValue(1176396200);
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
