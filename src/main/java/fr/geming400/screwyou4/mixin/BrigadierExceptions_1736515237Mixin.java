package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.BrigadierExceptions.class)
public class BrigadierExceptions_1736515237Mixin {
        @Inject(at = @At("HEAD"), method = "longTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void longTooLow__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherExpectedArgumentSeparator()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void dispatcherExpectedArgumentSeparator_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void longTooHigh__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void doubleTooHigh__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidEscape()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidEscape_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidInt()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidInt_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidBool()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidBool_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void doubleTooLow__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void floatTooHigh__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "integerTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void integerTooLow__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedInt()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedInt_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedLong()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedLong_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidDouble()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidDouble_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedDouble()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedDouble_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedFloat()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedFloat_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedBool()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedBool_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherUnknownCommand()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void dispatcherUnknownCommand_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "literalIncorrect()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void literalIncorrect_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidLong()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidLong_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void floatTooLow__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedSymbol()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerExpectedSymbol_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherParseException()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void dispatcherParseException_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "integerTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void integerTooHigh__1819163473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819163473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedStartOfQuote()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedStartOfQuote_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedEndOfQuote()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedEndOfQuote_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidFloat()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidFloat_382805213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382805213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherUnknownArgument()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void dispatcherUnknownArgument_948036784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948036784L))
            info.setReturnValue(null);
    }


}
