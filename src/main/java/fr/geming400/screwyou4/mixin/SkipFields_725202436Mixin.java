package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.SkipFields.class)
public class SkipFields_725202436Mixin {
        @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__1335795553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335795553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitContainerEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitContainerEnd__1955203408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955203408L))
            info.setReturnValue(null);
    }


}
