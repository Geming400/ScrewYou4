package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.CollectFields.class)
public class CollectFields_390846283Mixin {
        @Inject(at = @At("HEAD"), method = "visitRootEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitRootEntry__699907764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699907764L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitContainerEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitContainerEnd__820395780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820395780L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__437915425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437915425L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__843994903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843994903L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "getMissingFieldCount()I", cancellable = true)
    private void getMissingFieldCount_1550692043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550692043L))
            info.setReturnValue(-281849107);
    }


}
