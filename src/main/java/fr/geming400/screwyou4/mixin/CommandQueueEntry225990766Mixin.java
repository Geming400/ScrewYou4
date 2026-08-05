package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.CommandQueueEntry.class)
public class CommandQueueEntry225990766Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__682635502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682635502L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_996414291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996414291L))
            info.setReturnValue("Gg>{\u7D47GWMfB\u2345pOH;$O\u7929iY*{|z3JTvX61E2e\uBC3EzZgACadqR#0\u687F}3\u6B49XP\uB4AEug:\u37E6zip2ayW\u1783Lj\u5F08N[Y8tR)=m\u9F51<!YT\u022ErH rQ7bWTJ\u6BB4|)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_783342857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783342857L))
            info.setReturnValue(779946933);
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;)V", cancellable = true)
    private void execute_1796610988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1796610988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/commands/execution/EntryAction;", cancellable = true)
    private void action_2055384660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055384660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frame()Lnet/minecraft/commands/execution/Frame;", cancellable = true)
    private void frame_594848902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594848902L))
            info.setReturnValue(null);
    }


}
