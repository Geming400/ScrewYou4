package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.CollectFields.class)
public class CollectFields_390846283Mixin {
        @Inject(at = @At("HEAD"), method = "getMissingFieldCount()I", cancellable = true)
    private void getMissingFieldCount_429108528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429108528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__1670151706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670151706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry_441073072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441073072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitRootEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitRootEntry_1757504401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757504401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitContainerEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitContainerEnd_2005407735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005407735L))
            info.setReturnValue(null);
    }


}
