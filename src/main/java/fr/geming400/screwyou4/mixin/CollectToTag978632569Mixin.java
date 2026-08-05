package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.CollectToTag.class)
public class CollectToTag978632569Mixin {
        @Inject(at = @At("HEAD"), method = "getResult()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void getResult__1773047642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773047642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(D)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__1351770446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351770446L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visit(F)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_186569584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186569584L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit(J)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__1031717652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031717652L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit([B)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__1967550593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967550593L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visit([I)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__878327784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878327784L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit([J)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__109157769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109157769L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit(Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__170379556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170379556L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit(B)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1404856820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404856820L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit(S)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1595845187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595845187L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit(I)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__1800887667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800887667L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visitEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitEnd__1701773274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701773274L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitContainerEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitContainerEnd__1701773274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701773274L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitRootEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitRootEntry__1949676608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949676608L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__1082365419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082365419L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry_1028859359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028859359L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.SKIP);
    }

    @Inject(at = @At("HEAD"), method = "visitElement(Lnet/minecraft/nbt/TagType;I)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitElement_2082579538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082579538L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.SKIP);
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/TagType;I)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitList__895956429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895956429L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }


}
