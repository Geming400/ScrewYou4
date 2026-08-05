package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.CollectToTag.class)
public class CollectToTag978632569Mixin {
        @Inject(at = @At("HEAD"), method = "getResult()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void getResult__340446797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340446797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(D)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1642170951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1642170951L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit(F)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__1114456315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114456315L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit(J)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1962223745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962223745L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit([B)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_650319498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650319498L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit([I)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1739542307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739542307L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visit([J)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit__1786254974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1786254974L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visit(Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1799374823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799374823L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visit(B)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_103830921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103830921L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit(S)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_294819288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294819288L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visit(I)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visit_1193053730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193053730L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visitRootEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitRootEntry__112121477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112121477L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visitContainerEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitContainerEnd__232609493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232609493L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry_149870862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149870862L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitEntry(Lnet/minecraft/nbt/TagType;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitEntry__256208616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256208616L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "visitElement(Lnet/minecraft/nbt/TagType;I)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private void visitElement__477623933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477623933L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitEnd()Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitEnd_103879606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103879606L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/TagType;I)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void visitList__624515908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624515908L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }


}
