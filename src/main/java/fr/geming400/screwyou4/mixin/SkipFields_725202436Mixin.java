package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.SkipFields.class)
public class SkipFields_725202436Mixin {
        @Inject(at = @At("HEAD"), method = "visitContainerEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitContainerEnd__486039627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486039627L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__103559272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103559272L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.BREAK);
    }


}
